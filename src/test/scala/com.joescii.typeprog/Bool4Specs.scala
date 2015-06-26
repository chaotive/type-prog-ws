package com.joescii.typeprog

import com.joescii.typeprog.Bool.{->, /\, \/}

object Bool4Specs {
  implicitly[True \/ False =:= True]
  implicitly[True /\ False =:= False]
  implicitly[True -> False =:= False]
}
