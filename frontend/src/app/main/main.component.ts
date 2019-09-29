import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from '@angular/material';
import {Router} from "@angular/router";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit {
  OrderRegForm: FormGroup;

  constructor(
    public dialog: MatDialog,
    private formBuilder: FormBuilder
  ) {
  }

  ngOnInit() {
    this.OrderRegForm = this.formBuilder.group({
      ticketNum: ['', Validators.required],
      phone: ['', Validators.required],
    });
  }


  openDialog(): void {
    const dialogRef = this.dialog.open(OrderRegModalComponent, {
      width: '600px',
      height: '451px',
      data: this.OrderRegForm
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed', result);
    });
  }
}


@Component({
  selector: 'app-order-reg-modal',
  templateUrl: './order-reg-modal/order-reg-modal.component.html',
  styleUrls: ['./order-reg-modal/order-reg-modal.component.scss']
})
export class OrderRegModalComponent {


  constructor(public dialogRef: MatDialogRef<OrderRegModalComponent>,
              @Inject(MAT_DIALOG_DATA) public data: FormGroup, public dialog: MatDialog,
              private router: Router) {
  }

  onSubmit(): void {
    this.router.navigate(['menu']);
    this.dialogRef.close();
  }

  openCamera() {

  }
}

