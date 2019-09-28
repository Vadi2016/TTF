import {PdfFile} from "./file.model";

export class Competence {
  constructor(
    public title: string,
    public progressing: boolean,
    public time: number,
    public cost: number,
    public program_pdf: PdfFile,
    public checked?: boolean,

    public id?: string
  ){

  }
}
