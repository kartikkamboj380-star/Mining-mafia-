package io.invertase.firebase.crashlytics;

import com.facebook.react.N;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c implements N {
    @Override // com.facebook.react.N
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeFirebaseCrashlyticsModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.N
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
