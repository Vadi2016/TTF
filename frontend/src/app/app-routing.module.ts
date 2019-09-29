import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MainComponent} from './main/main.component';
import {OrderMainComponent} from './order-main/order-main.component';
import {RestaurantComponent} from './restaurant/restaurant.component';

const routes: Routes = [
  {path: '', component: MainComponent,
    // canActivate: [AuthGuard]
  },
  {path: 'menu', component: OrderMainComponent,
    // canActivate: [AuthGuard]
  },
  {path: 'restaurant', component: RestaurantComponent,
    // canActivate: [AuthGuard]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
