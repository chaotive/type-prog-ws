package com.joescii.typeprog

import com.joescii.typeprog.Nat._

object Nat3Specs {
  // Can you generate a Nat so large that it breaks the compiler with a java.lang.StackOverflowError?  
  type Nat1 = NatN[Nat0]
  type Nat2 = NatN[Nat1]
  type Nat3 = NatN[Nat2]
  
  implicitly[Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 * Nat2 =:= Nat3]
}
