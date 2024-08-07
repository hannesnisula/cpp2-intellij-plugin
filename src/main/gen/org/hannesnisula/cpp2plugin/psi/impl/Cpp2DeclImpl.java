// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.hannesnisula.cpp2plugin.psi.Cpp2Types.*;
import org.hannesnisula.cpp2plugin.psi.Cpp2NamedElementImpl;
import org.hannesnisula.cpp2plugin.psi.*;

public class Cpp2DeclImpl extends Cpp2NamedElementImpl implements Cpp2Decl {

  public Cpp2DeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2Expr getExpr() {
    return findChildByClass(Cpp2Expr.class);
  }

  @Override
  @Nullable
  public Cpp2Type getType() {
    return findChildByClass(Cpp2Type.class);
  }

  @Override
  @Nullable
  public String getIdentifierString() {
    return Cpp2PsiUtil.getIdentifierString(this);
  }

  @Override
  @Nullable
  public PsiElement getNameIdentifier() {
    return Cpp2PsiUtil.getNameIdentifier(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@NotNull String newName) {
    return Cpp2PsiUtil.setName(this, newName);
  }

}
