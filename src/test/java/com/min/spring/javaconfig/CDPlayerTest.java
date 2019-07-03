package com.min.spring.javaconfig;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

  @Rule
  public final SystemOutRule rule = new SystemOutRule();

  @Autowired
  private MediaPlayer player;

  @Test
  public void play() {
    player.play();
		/*
		 * assertEquals(
		 * "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
		 * rule.getLog());
		 */
    Assert.hasText("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", rule.getLog());
  }

}
