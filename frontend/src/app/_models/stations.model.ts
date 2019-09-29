import {RouteModel} from "./route.model";

export class StationsModel {
  constructor(
    public number: string,
    public date: number,
    public start: string,
    public finish: string,
    public route: RouteModel[]
  ) {
  }
}
