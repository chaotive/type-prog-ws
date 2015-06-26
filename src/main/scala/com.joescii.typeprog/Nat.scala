package com.joescii.typeprog

sealed trait Nat {
  type plus[That <: Nat] <: Nat
  type times[That <: Nat] <: Nat  
}
sealed trait Nat0 extends Nat {
  override type plus[That <: Nat] = That
  override type times[That <: Nat] = Nat0  
}
sealed trait NatN[Prev <: Nat] extends Nat {
  override type plus[That <: Nat] = NatN[Prev#plus[That]]
  override type times[That <: Nat] = NatN[Prev#plus[Prev#times[That]]]  
}

object Nat {
  type +[A <: Nat, B <: Nat] = A#plus[B]
  type *[A <: Nat, B <: Nat] = A#times[B]
}
