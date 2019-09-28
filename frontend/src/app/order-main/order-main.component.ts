import {Component, ElementRef, HostListener, OnInit, Renderer2, ViewChild} from '@angular/core';
import { OwlOptions } from 'ngx-owl-carousel-o';

declare var $: any;

@Component({
  selector: 'app-order-main',
  templateUrl: './order-main.component.html',
  styleUrls: ['./order-main.component.scss']
})
export class OrderMainComponent implements OnInit {

  constructor(public renderer: Renderer2) {
  }

  stationList: string[] = ['Москва'];
  isTrainGo = false;
  trainIsLeft;
  routes;
  fromRZD = true;
  @ViewChild('train') el: ElementRef;


  ngOnInit() {
    this.stationList.push('Самара', 'Нижний Новгород', 'Вязники', 'Екатиринбург');

    $('.ui.dropdown').dropdown();
  }

  onMouseMove(event: MouseEvent) {
    const OFFSET_X = 470;
    this.trainIsLeft = event.pageX - OFFSET_X;

    // this.el.nativeElement.style.offsetLeft = this.trainIsLeft;
  }
}
