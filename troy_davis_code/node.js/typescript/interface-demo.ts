let drawPoint = (x, y) => {
    //implement here
}
let drawPoint_2 = (point) => {
    //
}
drawPoint_2({
    x: 1,
    y: 2
})
drawPoint_2({
    x: 1,
    y: 2,
    dog: 'ronin'
})

let drawPoint_3 = (point: {x: number, y: number}) => {

}

drawPoint_3({
    x: 4,
    y: 5
})

interface Point {
    x: number,
    y: number
}

let drawPoint_4 = (point: Point) => {
    console.log(point.x);
    console.log(point.y);
}
class MyClass {
    private _myVar: string;

    constructor(someVar){
        this._myVar = someVar;
    }
    
    get myVar() {
        return this.myVar;
    }
}

let myInstance = new MyClass('something');
console.log(myInstance);