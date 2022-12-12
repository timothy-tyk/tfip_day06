// Primitives - Scalar Type
const username = "fred";
const age = 50;

//Array,Objects - Reference Type
let numList = [1, 2, 3, 4, 5];

// Java - Method
function greetings(name) {
  console.log(`Hello, ${name}`);
}

//Annonymous Functions, Lambda functions -> parameters are important instead of name
let greetings = function (name) {
  console.log(`Hello, ${name}`);
};
//Arrow Function
const greetings = (name) => {
  console.log(`Hello, ${name}`);
};

console.log(`name: ${username}, age: ${age}`);
console.log(greetings);
greetings("Barney");
