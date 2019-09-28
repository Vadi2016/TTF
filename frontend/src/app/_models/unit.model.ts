import {Competence} from "./competence.model";
import {EducationForm} from "./edForms.model";

export class Unit {
  constructor(
    public title: string,
    public base_competence: Competence[],
    public additional_competence: Competence[],
    public education_forms: EducationForm[],
    public id?: string
  ) {
  }
}
