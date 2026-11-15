package com.tenjin.android.params.base;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AParamProvider implements ParamProvider {
    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> getParams() {
        return apply(new HashMap());
    }
}
