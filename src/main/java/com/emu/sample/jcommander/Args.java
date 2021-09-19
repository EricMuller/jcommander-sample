package com.emu.sample.jcommander;

import com.beust.jcommander.Parameter;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Args {
  @Parameter
  private List <String> parameters = new ArrayList <>();

  @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
  private Integer verbose = 1;

  @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
  private String groups;

  @Parameter(names = "-debug", description = "Debug mode")
  private boolean debug = false;




}
