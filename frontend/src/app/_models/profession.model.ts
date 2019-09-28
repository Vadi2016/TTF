import {Unit} from "./unit.model";

export class Profession {
  constructor(
    public title: string,
    public units: Unit[],
    public id?: string
  ){}
}
