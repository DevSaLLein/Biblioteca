// yarn tsc --init => configurações do Typescript

interface Usuario {
    name?: string;
    dtNasc: number;
}

const calc = (usuario: Usuario) => {
    return 2023 - usuario.dtNasc;
}

calc({ dtNasc: 2006 });

// --------------------------------

interface User {
    name?: string;
    age: number;
    address: Address;
}

type UserProperties = keyof User;  

interface Address {
    street: string;
    number: number;
}

const user: User = {
    name: 'Isaac',
    age: 17,
    address: {
        street: 'Rua A',
        number: 150
    }
}

const video = {
    title: 'Video de Typescript',
    description: 'Introdução em Typescript'
}

type Video = keyof typeof video; 

const pickProperty = (user: User, property: UserProperties) => {
    return user[property];
}

console.log(pickProperty(user, 'address'));

// Generics | Utility Types

type pickPropertyReturnType = ReturnType<typeof pickProperty>; 

type UserWithoutAddressAndName = Omit<User, 'address' | 'name'>; 
 
type UserWithNameAndAge = Pick<User, 'name' | 'age'>;

type PartialUser = Partial<User>;

// -------------------------------

interface DbConfig {
    name: string;
    url: string;
    timeout?: number;
}

// Força uma tipagem
const connectionOne = { name: 'Postgresql', url: 'postgresql://user@password/example' } as DbConfig;

// Tipagem Obrigatória e Estática
const connectionTwo: DbConfig = { name: 'MySql', url: 'mysql://user:password/example', timeout: 900 };
const IsMySql = connectionTwo.name == 'MySql'
const timeoutFromConnectionTwo = connectionTwo.timeout; 

// Tipagem Obrigatória e Dinâmica
const connectionThree = { name: 'SqLite', url: 'sqlite://user:password/example', timeout: 900 } satisfies DbConfig;
const isSqLite = connectionThree.name == 'SqLite';
const connectionThreeName = connectionThree.name;
const timoutFromConnectionThree = connectionThree.timeout


// -----------------------------

interface Paisagem {
    local: string;
    avaliation: number;
}

interface Person {
    name: string; 
    cpf: string;
}

const person: Person = {
    name: 'DevSaLLein',
    cpf: '111.111.111-11'
}

const paisagem: Paisagem = {
    local: 'Las Vegas',
    avaliation: 10
}

const pickPropertyDinamic = <ObjectDinamic extends Record<string, any> >(
        user: ObjectDinamic, 
        property: keyof ObjectDinamic
    ) => {

    return user[property];
}

pickPropertyDinamic({ name: 'DevSaLLein', age: 17 }, 'name');