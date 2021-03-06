/*
 * Copyright (C) 2013-2016 Peng Li<aqnote@qq.com>.
 * This library is free software; you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation;
 */
package com.aqnote.shared.javacc.minijava;
/* Generated By:JavaCC: Do not edit this line. MiniJavaParserVisitor.java Version 5.0 */
public interface MiniJavaParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTGoal node, Object data);
  public Object visit(ASTMainClass node, Object data);
  public Object visit(ASTTypeDeclaration node, Object data);
  public Object visit(ASTClassDeclaration node, Object data);
  public Object visit(ASTClassExtendsDeclaration node, Object data);
  public Object visit(ASTVarDeclaration node, Object data);
  public Object visit(ASTMethodDeclaration node, Object data);
  public Object visit(ASTFormalParameterList node, Object data);
  public Object visit(ASTFormalParameter node, Object data);
  public Object visit(ASTFormalParameterRest node, Object data);
  public Object visit(ASTType node, Object data);
  public Object visit(ASTArrayType node, Object data);
  public Object visit(ASTBooleanType node, Object data);
  public Object visit(ASTIntegerType node, Object data);
  public Object visit(ASTStatement node, Object data);
  public Object visit(ASTBlock node, Object data);
  public Object visit(ASTAssignmentStatement node, Object data);
  public Object visit(ASTArrayAssignmentStatement node, Object data);
  public Object visit(ASTIfStatement node, Object data);
  public Object visit(ASTWhileStatement node, Object data);
  public Object visit(ASTPrintStatement node, Object data);
  public Object visit(ASTExpression node, Object data);
  public Object visit(ASTAndExpression node, Object data);
  public Object visit(ASTCompareExpression node, Object data);
  public Object visit(ASTPlusExpression node, Object data);
  public Object visit(ASTMinusExpression node, Object data);
  public Object visit(ASTTimesExpression node, Object data);
  public Object visit(ASTArrayLookup node, Object data);
  public Object visit(ASTArrayLength node, Object data);
  public Object visit(ASTMessageSend node, Object data);
  public Object visit(ASTExpressionList node, Object data);
  public Object visit(ASTExpressionRest node, Object data);
  public Object visit(ASTPrimaryExpression node, Object data);
  public Object visit(ASTIntegerLiteral node, Object data);
  public Object visit(ASTTrueLiteral node, Object data);
  public Object visit(ASTFalseLiteral node, Object data);
  public Object visit(ASTIdentifier node, Object data);
  public Object visit(ASTThisExpression node, Object data);
  public Object visit(ASTArrayAllocationExpression node, Object data);
  public Object visit(ASTAllocationExpression node, Object data);
  public Object visit(ASTNotExpression node, Object data);
  public Object visit(ASTBracketExpression node, Object data);
}
/* JavaCC - OriginalChecksum=523d5431f8b95d94b771b8d7e8f381a9 (do not edit this line) */
