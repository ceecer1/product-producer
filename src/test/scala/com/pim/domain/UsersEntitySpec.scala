package com.pim.domain

import com.google.protobuf.empty.Empty
import com.pim.api
import kalix.scalasdk.eventsourcedentity.EventSourcedEntity
import kalix.scalasdk.testkit.EventSourcedResult
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class UsersEntitySpec extends AnyWordSpec with Matchers {
  "The UsersEntity" should {
    "have example test that can be removed" in {
      val testKit = UsersEntityTestKit(new UsersEntity(_))
      pending
      // use the testkit to execute a command:
      // val result: EventSourcedResult[R] = testKit.someOperation(SomeRequest("id"));
      // verify the emitted events
      // val actualEvent: ExpectedEvent = result.nextEventOfType[ExpectedEvent]
      // actualEvent shouldBe expectedEvent
      // verify the final state after applying the events
      // testKit.state() shouldBe expectedState
      // verify the reply
      // result.reply shouldBe expectedReply
      // verify the final state after the command
    }

    "correctly process commands of type CreateUser" in {
      val testKit = UsersEntityTestKit(new UsersEntity(_))
      pending
      // val result: EventSourcedResult[Empty] = testKit.createUser(api.CreateUserRequest(...))
    }
  }
}
