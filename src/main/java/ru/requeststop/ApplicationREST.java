/**
 * 
 */
package ru.requeststop;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ru.funsys.avalanche.Application;
import ru.requeststop.model.Restaurant;


/**
 * Класс реализации функций REST сервиса
 * 
 * @author Валерий Лиховских
 *
 */
@Path("/service")
public class ApplicationREST extends Application {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4406005218081523140L;
	
	private static final String UTF_8 = "utf8"; // NOI18N 
	
	private static final String TTF0001E = "TTF0001E"; // NOI18N 
	private static final String TTF0002E = "TTF0002E"; // NOI18N 
	private static final String TTF0003E = "TTF0003E"; // NOI18N 
	private static final String TTF0004E = "TTF0004E"; // NOI18N 

	/**
	 * Адаптер доступа к функии поиска маршрутов
	 * Для инициализации этого поля в файле конфигурации должен быть 
	 * определен дочерний элкемент <b>{@code <adapter>}</b> с атрибутом <b>{@code name}</b>
	 * с установленным значением <b>{@code adapterRoute}</b>. 
	 * 
	 * <pre>
	 * &lt;adapter class="ru.requeststop.AdapterRoute" name="adapterRoute" uri="function-adapter" /&gt;	
	 * </pre> 
	 */
	private AdapterService adapterService;
	
	/**
	 * Получить рассписание движения поезда по номеру билета
	 * 
	 * <p> 
	 * Пример возвращаемых данных
	 * 
	 * <pre>
	 * [{"mnemocode":"A1","first":"Университет имени Лобачевского","last":"Больница имени Семашко","timer":25,
	 * "points":[{"latitude":56.298343,"longitude":43.983657,"name":"Университет имени Лобачевского"},
	 * {"latitude":56.304374,"longitude":43.984215,"name":"улица студенческая"},
	 * {"latitude":56.308090,"longitude":43.988941,"name":"средной рынок"},
	 * {"latitude":56.310249,"longitude":43.999161,"name":"студеная улица"},
	 * {"latitude":56.312658,"longitude":44.006381,"name":"ашхабадская улица"},
	 * {"latitude":56.316081,"longitude":44.016649,"name":"оперный театр"},
	 * {"latitude":56.318120,"longitude":44.023622,"name":"улица полтавская"},
	 * {"latitude":56.319145,"longitude":44.027721,"name":"улица белинского"},
	 * {"latitude":56.322007,"longitude":44.036883,"name":"Сенная площадь"},
	 * {"latitude":56.320683,"longitude":44.048127,"name":"донецкая улица"},
	 * {"latitude":56.319801,"longitude":44.054511,"name":"фруктовая улица"},
	 * {"latitude":56.318000,"longitude":44.062622,"name":"Учебный комбинат ЗАО Маяк"},
	 * {"latitude":56.315323,"longitude":44.069756,"name":"Медвежья долина"},
	 * {"latitude":56.310684,"longitude":44.074498,"name":"Улица Родионова"},
	 * {"latitude":56.309414,"longitude":44.076086,"name":"Больница имени Семашко"}]}]
	 * </pre>
	 * 
	 * 
	 * @param lang язык запроса, значение по умолчанию - ru
	 * @param ticket номер билета
	 * 
	 * @return рассписание движения поезда
	 */
	@GET
	@Path("/findByTicket")
	@Produces( "application/json" )
	public Response findTrain(@QueryParam("lang") @DefaultValue("ru") String lang,
			                 @QueryParam("number") String number) {
    	try {
			return Response.ok(adapterService.searchByTicketNumber(number, lang)).type(MediaType.APPLICATION_JSON_TYPE.withCharset(UTF_8)).build();
		} catch (Throwable throwable) {
			// TODO: handle exception
			return RestExceptionMapper.newRestException(logger, throwable, TTF0001E, lang);
		}
		
	}

	/**
	 * Получить расписание движения поезда по станции оправления, дате и номеру поезда
	 * 
	 * @param lang язак возвращаемого результата
	 * @param sattion станция отправления
	 * @param date дата отправления
	 * @param number номер поезда 
	 * 
	 * @return рассписание запрошенного маршрута или сообщение об ошибке
	 * 
	 * Пример ошибки:
	 * <pre>
	 * {"message":"Рассписание маршрута не найдена.","code":"ROUTE002E","cause":null}
	 * </pre>
	 */
	@GET
	@Path("/findByNumber")
	@Produces( "application/json" )
	public Response findByNumber(@QueryParam("lang") @DefaultValue("ru") String lang,
                              @QueryParam("station") String station,
                              @QueryParam("date") String date,
                              @QueryParam("number") String number) {
    	try {
    		GregorianCalendar calendar = new GregorianCalendar();
    		//if (date != null) calendar.setTime(date);
			return Response.ok(adapterService.searchByTrainNumber(station, calendar, number, lang)).type(MediaType.APPLICATION_JSON_TYPE.withCharset(UTF_8)).build();
		} catch (Throwable throwable) {
			// TODO: handle exception
			return RestExceptionMapper.newRestException(logger, throwable, TTF0002E, lang);
		}
	}

	@GET
	@Path("/restaurants")
	@Produces("application/json")
	public Response getRestaurants(@QueryParam("lang") @DefaultValue("ru") String lang,
								@QueryParam("code") String code) {
    	try {
			return Response.ok(adapterService.getRestaurants(code, lang)).type(MediaType.APPLICATION_JSON_TYPE.withCharset(UTF_8)).build();
		} catch (Throwable throwable) {
			// TODO: handle exception
			return RestExceptionMapper.newRestException(logger, throwable, TTF0003E, lang);
		}
	}
	
	@GET
	@Path("/restaurant")
	@Produces("application/json")
	public Response getMenu(@QueryParam("lang") @DefaultValue("ru") String lang,
								@QueryParam("code") String code) {
    	try {
			return Response.ok(adapterService.getRestaurant(code, lang)).type(MediaType.APPLICATION_JSON_TYPE.withCharset(UTF_8)).build();
		} catch (Throwable throwable) {
			// TODO: handle exception
			return RestExceptionMapper.newRestException(logger, throwable, TTF0004E, lang);
		}
	}

	static {
		// Пустой вызов для инициализации статического кода, эмулирующего модель данных
		Restaurant.init();
	}
	
}
