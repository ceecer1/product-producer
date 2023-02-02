package com.pim.action

import com.pim.domain.ProductCreated
import kalix.scalasdk.action.Action
import kalix.scalasdk.action.ActionCreationContext

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class ProductStreamAction(creationContext: ActionCreationContext) extends AbstractProductStreamAction {

  override def transformProductCreated(productCreated: ProductCreated): Action.Effect[ProductCreated] = {
    effects.reply(productCreated)
  }
}

