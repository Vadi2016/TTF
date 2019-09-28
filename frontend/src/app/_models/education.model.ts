import {EducationKind} from "./educationKind.model";

export class Education {
  constructor(
    public title: string,
    public kinds?: EducationKind[],
    public id?: string
  ) {
  }
}
