import { Component ,Input} from '@angular/core';

@Component({
  selector: 'app-child-cmp',
  templateUrl: './child-cmp.component.html',
  styleUrls: ['./child-cmp.component.css']
})
export class ChildCmpComponent   {

//ngOn change
ngOnChanges(){

  console.log("data property is changes by parent "+this.d)
}

  @Input() public d: any;
}
