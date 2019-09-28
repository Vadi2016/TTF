import {Profession} from "./profession.model";

export class EducationKind {
  constructor(
    public title: string,
    public professions?: Profession[],
    public hours?: string,
    public id?: string
  ) {

  }
}
