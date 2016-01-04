/*
 * Copyright 2010 Greplin, Inc. All Rights Reserved.
 */

package io.hedwig.alg.greplinbloomfilter;

import java.io.IOException;

/**
 * Thrown when we encounter an invalid bloom filter (unrecognized version, truncated, corrupted, etc).
 */
public class InvalidBloomFilter extends IOException {
  public InvalidBloomFilter(String s) {
    super(s);
  }
}
