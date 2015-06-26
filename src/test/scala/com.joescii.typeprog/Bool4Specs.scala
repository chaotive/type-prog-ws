package com.joescii.typeprog

object Bool4Specs {
  implicitly[True \/ False =:= True]
  implicitly[True /\ False =:= False]
  implicitly[True -> False =:= False]
}
