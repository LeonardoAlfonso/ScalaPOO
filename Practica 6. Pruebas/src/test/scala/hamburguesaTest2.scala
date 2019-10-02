// import org.scalatest.FunSpec
// import org.scalatest.BeforeAndAfter

// class hamburguesaTest2 extends FunSpec with BeforeAndAfter 
// {
//     var hamburguesa : Hamburguesa = _

//     before {
//         hamburguesa = new Hamburguesa(3000)
//     }

//     describe("Creacion Hamburguesa") {
//         it("Precio Inicial debe ser 3000") {
//             assert(hamburguesa.calcularPrecio() == 3000)
//         }

//         it("Al agregar un ingrediente debe costar 5000") {
//             hamburguesa.agregarIngrediente("pollo")
//             assert(hamburguesa.calcularPrecio() == 5000)
//         }   

//         it("Debe tener 1 ingrediente"){
//             hamburguesa.agregarIngrediente("pollo")
//             assert(hamburguesa.ingredientes.size == 1)
//         }
//   }
// }