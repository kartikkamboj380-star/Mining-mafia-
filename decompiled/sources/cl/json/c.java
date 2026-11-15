package cl.json;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends Y {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put(NativeRNShareSpec.NAME, new ReactModuleInfo(NativeRNShareSpec.NAME, NativeRNShareSpec.NAME, false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC1272a, com.facebook.react.N
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNShareSpec.NAME)) {
            return new RNShare(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1272a
    public p244y3.a getReactModuleInfoProvider() {
        return new p244y3.a() { // from class: cl.json.b
            @Override // p244y3.a
            public final Map a() {
                return c.c();
            }
        };
    }
}
