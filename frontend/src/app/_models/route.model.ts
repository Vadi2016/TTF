export class RouteModel {
  constructor(
    public station: string,
    public arrival: string,
    public departure: string,
    public stoping: string,
    public code: number,
    public day: number
  ) {

  }
}
