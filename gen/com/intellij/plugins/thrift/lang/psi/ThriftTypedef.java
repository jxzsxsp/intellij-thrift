// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.thrift.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ThriftTypedef extends ThriftPsiCompositeElement {

  @Nullable
  ThriftBaseType getBaseType();

  @Nullable
  ThriftListType getListType();

  @Nullable
  ThriftMapType getMapType();

  @Nullable
  ThriftSetType getSetType();

}
