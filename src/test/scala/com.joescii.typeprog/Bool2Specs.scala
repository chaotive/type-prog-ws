package com.joescii.typeprog

import shapeless.test.illTyped

object Bool2Specs {
  implicitly[True#And[True] =:= True]
  implicitly[True#And[False] =:= False]
  implicitly[False#And[True] =:= False]
  implicitly[False#And[False] =:= False]

  illTyped("implicitly[True#And[True] =:= False]")
  illTyped("implicitly[True#And[False] =:= True]")
  illTyped("implicitly[False#And[True] =:= True]")
  illTyped("implicitly[False#And[False] =:= True]")

  // TODO: Di you implement And without touching True or False? It can be done :)
}
