// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2VarDefinition extends PsiElement {

  @NotNull
  Cpp2Expression getExpression();

  @Nullable
  Cpp2TypeSpecifier getTypeSpecifier();

}