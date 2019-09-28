export class User {
  constructor(
    public email: string,
    public password: string,
    public token: string,
    public firstName?: string,
    public middleName?: string,
    public lastName?: string,
    public role?: string,
    public createdAt?: bigint,
    public updatedAt?: bigint,
    public _id?: string
  ) {
  }
}
