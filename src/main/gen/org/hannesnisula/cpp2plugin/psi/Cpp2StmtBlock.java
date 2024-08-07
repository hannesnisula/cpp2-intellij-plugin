// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2StmtBlock extends PsiElement {

  @NotNull
  List<Cpp2Assign> getAssignList();

  @NotNull
  List<Cpp2Decl> getDeclList();

  @NotNull
  List<Cpp2DoWhileLoop> getDoWhileLoopList();

  @NotNull
  List<Cpp2Expr> getExprList();

  @NotNull
  List<Cpp2ForLoop> getForLoopList();

  @NotNull
  List<Cpp2FuncAliasDecl> getFuncAliasDeclList();

  @NotNull
  List<Cpp2FuncDecl> getFuncDeclList();

  @NotNull
  List<Cpp2IfBranch> getIfBranchList();

  @NotNull
  List<Cpp2NamespaceAliasDecl> getNamespaceAliasDeclList();

  @NotNull
  List<Cpp2ObjAliasDecl> getObjAliasDeclList();

  @NotNull
  List<Cpp2TypeAliasDecl> getTypeAliasDeclList();

  @NotNull
  List<Cpp2UsingNamespace> getUsingNamespaceList();

  @NotNull
  List<Cpp2WhileLoop> getWhileLoopList();

}
