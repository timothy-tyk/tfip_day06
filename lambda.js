const names = ["fred", "barney", "betty", "wilma"];

const hello = function (name) {
  console.log(`Hello, ${name}`);
};
const username = "fred";

const sayHello = function (fn, args) {
  // if fn is a function, then i can call fucntion
  fn(args);
};

hello(username);
hello("barney");
sayHello(hello, "wilma"); //pass in function into another function, passing in a behaviour

for (let n of names) {
  sayHello(hello, n);
}
