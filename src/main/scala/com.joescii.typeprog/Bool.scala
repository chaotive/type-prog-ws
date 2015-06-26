package com.joescii.typeprog

sealed trait Bool {
  type Not <: Bool
  type Or[That <: Bool] <: Bool
}
sealed trait True extends Bool {
  override type Not = False
  override type Or[That <: Bool] = True
}
sealed trait False extends Bool {
  override type Not = True
  override type Or[That <: Bool] = That
}
