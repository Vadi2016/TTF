export class PdfFile {
  constructor(
    public filename: string,
    public folder: string,
    public file_type: string,
    public url: string,
    public id?: string
  ){

  }
}
