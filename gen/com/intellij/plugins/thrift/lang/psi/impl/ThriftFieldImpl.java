// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.thrift.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.thrift.lang.lexer.ThriftTokenTypes.*;
import com.intellij.plugins.thrift.lang.psi.*;

public class ThriftFieldImpl extends ThriftPsiCompositeElementImpl implements ThriftField {

  public ThriftFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ThriftVisitor) ((ThriftVisitor)visitor).visitField(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ThriftConstValue getConstValue() {
    return findChildByClass(ThriftConstValue.class);
  }

  @Override
  @Nullable
  public ThriftFieldID getFieldID() {
    return findChildByClass(ThriftFieldID.class);
  }

  @Override
  @Nullable
  public ThriftFieldReq getFieldReq() {
    return findChildByClass(ThriftFieldReq.class);
  }

  @Override
  @NotNull
  public ThriftFieldType getFieldType() {
    return findNotNullChildByClass(ThriftFieldType.class);
  }

  @Override
  @Nullable
  public ThriftListSeparator getListSeparator() {
    return findChildByClass(ThriftListSeparator.class);
  }

  @Override
  @NotNull
  public ThriftXsdFieldOptions getXsdFieldOptions() {
    return findNotNullChildByClass(ThriftXsdFieldOptions.class);
  }

}
