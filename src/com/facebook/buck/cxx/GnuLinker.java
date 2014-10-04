/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.cxx;

import com.facebook.buck.rules.SourcePath;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/**
 * A specialization of {@link Linker} containing information specific to the GNU implementation.
 */
public class GnuLinker implements Linker {

  private final SourcePath path;

  public GnuLinker(SourcePath path) {
    this.path = Preconditions.checkNotNull(path);
  }

  @Override
  public SourcePath getPath() {
    return path;
  }

  @Override
  public Iterable<String> linkWhole(String arg) {
    return ImmutableList.of("--whole-archive", arg, "--no-whole-archive");
  }

  @Override
  public Iterable<String> soname(String arg) {
    return ImmutableList.of("-soname", arg);
  }

}
