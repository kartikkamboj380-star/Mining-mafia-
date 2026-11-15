package F7;

import com.facebook.react.N;
import com.facebook.react.bridge.ReactApplicationContext;
import com.sparkfabrik.rnidfaaaid.ReactNativeIdfaAaidModule;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements N {
    @Override // com.facebook.react.N
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List listAsList = Arrays.asList(new ReactNativeIdfaAaidModule(reactContext));
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    @Override // com.facebook.react.N
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.i();
    }
}
