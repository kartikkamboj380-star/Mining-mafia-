package p059f8;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.zoontek.rnlocalize.NativeRNLocalizeSpec;
import com.zoontek.rnlocalize.RNLocalizeModule;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p244y3.a;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Y {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap map = new HashMap();
        map.put(NativeRNLocalizeSpec.NAME, new ReactModuleInfo(NativeRNLocalizeSpec.NAME, NativeRNLocalizeSpec.NAME, false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC1272a, com.facebook.react.N
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, NativeRNLocalizeSpec.NAME)) {
            return new RNLocalizeModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1272a
    public a getReactModuleInfoProvider() {
        return new a() { // from class: f8.j
            @Override // p244y3.a
            public final Map a() {
                return k.getReactModuleInfoProvider$lambda$0();
            }
        };
    }
}
