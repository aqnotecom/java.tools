/*
 * Copyright (C) 2013-2016 aqnote.com<aqnote.com@gmail.com>.
 * This library is free software; you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation;
 */
package com.aqnote.shared.javacc.minijava;
/* Generated By:JJTree: Do not edit this line. ASTBooleanType.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTBooleanType extends SimpleNode {
  public ASTBooleanType(int id) {
    super(id);
  }

  public ASTBooleanType(MiniJavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MiniJavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e46c55eddf38a4350d9dc1a738ea8ff3 (do not edit this line) */
