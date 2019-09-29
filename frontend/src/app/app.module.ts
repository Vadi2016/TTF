import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {MainComponent, OrderRegModalComponent} from './main/main.component';
import {RegistrationComponent} from './registration/registration.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {
  MatButtonModule, MatDatepickerModule, MatIconModule,
  MatInputModule,
  MatSelectModule,
  MatSlideToggleModule,
  MatNativeDateModule,
  NativeDateModule,
  MatDialogModule,
  MatTableModule, MAT_DATE_FORMATS, DateAdapter, MAT_DATE_LOCALE, MatCheckboxModule, MAT_CHECKBOX_CLICK_ACTION
} from '@angular/material';
import {OrderMainComponent} from './order-main/order-main.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MAT_DIALOG_DEFAULT_OPTIONS} from '@angular/material/dialog';
import { RestaurantComponent } from './restaurant/restaurant.component';

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    OrderRegModalComponent,
    RegistrationComponent,
    OrderMainComponent,
    RestaurantComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    MatDialogModule,
    BrowserAnimationsModule
  ],
  providers: [{provide: MAT_DIALOG_DEFAULT_OPTIONS, useValue: {hasBackdrop: true}}],
  bootstrap: [AppComponent],
  entryComponents: [OrderRegModalComponent],
})
export class AppModule {
}
