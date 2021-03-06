package com.mtomanski.timer.infrastructure.akka.adapter

import akka.persistence.journal.{Tagged, WriteEventAdapter}

class SpeedcuberEventsTaggingAdapter extends WriteEventAdapter {

  override def manifest(event: Any): String = event.getClass.getName

  override def toJournal(event: Any): Any = Tagged(event, Set("Speedcuber"))

}
