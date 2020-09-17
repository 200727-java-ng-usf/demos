import { Principal } from "./example";
import { Credentials } from "./user"

window.onload = () => {
    let creds = new Credentials();
    let principal = new Principal();

    creds.username = 'bill';
    principal.username = 'bob';

    console.log(creds);
    console.log(principal);
}