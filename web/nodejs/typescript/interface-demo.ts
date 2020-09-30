let drawPoint

let drawPoint_2 = (point) => {

}

drawPoint_2({
  // ....
})

drawPoint_2({
  x: 1,
  y:2
})

drawPoint_2({
  x: 1,
  y: 2,
  hamburger: 'good'
})

let drawPoint_3 = (point: { x: number; y: number }) => {
  console.log(point.x);
  console.log(point.y);
}

drawPoint_3({
  x: 1,
  y:2
})

drawPoint_3({
  a: 1,
  b:2
})

drawPoint_3({
  x: 1,
  y: 2,
  z: 3
})

interface Point {
  x: number,
  y:number
}

let drawPoint_4 = (point: Point) => {
  console.log(point.x);
  console.log(point.y);
}

drawPoint_4({
  x: 1,
  y: 2
})
