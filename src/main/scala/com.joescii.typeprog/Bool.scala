package com.joescii.typeprog

sealed trait Bool {
  type Not <: Bool
  type Or[That <: Bool] <: Bool
  type And[That <: Bool] = (this.type#Not#Or[That#Not])#Not //(A' OR B')'
  type Imp[That <: Bool] = this.type#Not#Or[That] //(A' OR B)
}
sealed trait True extends Bool {
  override type Not = False
  override type Or[That <: Bool] = True
}
sealed trait False extends Bool {
  override type Not = True
  override type Or[That <: Bool] = That
}

object Bool {
  type \/[A <: Bool, B <: Bool] = A#Or[B]
  type /\[A <: Bool, B <: Bool] = A#And[B]
  type ->[A <: Bool, B <: Bool] = A#Imp[B]
}