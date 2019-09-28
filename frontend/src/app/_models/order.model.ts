import {Education} from "./education.model";
import {EducationKind} from "./educationKind.model";
import {Profession} from "./profession.model";
import {Unit} from "./unit.model";
import {Competence} from "./competence.model";

export class Order {
  constructor(
    public education: Education,
    public educationKind: EducationKind,
    public profession: Profession,
    public unit: Unit,
    public base_competences: Competence[],
    public additional_competence: Competence[],
    public number_of_students: number,
    public email: string,
    public phone: string,
    public first_name: string,
    public last_name: string,
    public middle_name: string,
    public org_full_name: string,
    public org_legal_address: string,
    public org_actual_address: string,
    public org_fio_head: string,
    public org_post_head: string,
    public org_inn: string,
    public org_kpp: string,
    public bic: string,
    public personal_acc: string,
    public banc_acc: string,

  ) {
  }
}
