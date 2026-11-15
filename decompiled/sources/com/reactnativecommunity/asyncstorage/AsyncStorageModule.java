package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@p234x3.a(name = "RNCAsyncStorage")
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final k executor;
    private j mReactDatabaseSupplier;
    private boolean mShuttingDown;

    class a extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f42060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f42061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f42060a = callback;
            this.f42061b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f42060a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i10 = 0; i10 < this.f42061b.size(); i10 += 999) {
                int iMin = Math.min(this.f42061b.size() - i10, 999);
                Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.n().query("catalystLocalStorage", strArr, com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f42061b, i10, iMin), null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (cursorQuery.getCount() != this.f42061b.size()) {
                            for (int i11 = i10; i11 < i10 + iMin; i11++) {
                                hashSet.add(this.f42061b.getString(i11));
                            }
                        }
                        if (cursorQuery.moveToFirst()) {
                            do {
                                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                hashSet.remove(cursorQuery.getString(0));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                        for (String str : hashSet) {
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            writableArrayCreateArray3.pushString(str);
                            writableArrayCreateArray3.pushNull();
                            writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                        }
                        hashSet.clear();
                    } catch (Exception e10) {
                        Z1.a.J("ReactNative", e10.getMessage(), e10);
                        this.f42060a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage()), null);
                        cursorQuery.close();
                        return;
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            this.f42060a.invoke(null, writableArrayCreateArray);
        }
    }

    class b extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f42063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f42064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f42063a = callback;
            this.f42064b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:55:0x014e  */
        /* JADX WARN: Code duplicated, block: B:56:0x0158  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f42063a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.n().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().beginTransaction();
                    for (int i10 = 0; i10 < this.f42064b.size(); i10++) {
                        if (this.f42064b.getArray(i10).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                Z1.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapD != null) {
                                    return;
                                }
                            }
                        } else if (this.f42064b.getArray(i10).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                Z1.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapC != null) {
                                    return;
                                }
                            }
                        } else if (this.f42064b.getArray(i10).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                Z1.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapD2 != null) {
                                    return;
                                }
                            }
                        } else {
                            sQLiteStatementCompileStatement.clearBindings();
                            sQLiteStatementCompileStatement.bindString(1, this.f42064b.getArray(i10).getString(0));
                            sQLiteStatementCompileStatement.bindString(2, this.f42064b.getArray(i10).getString(1));
                            sQLiteStatementCompileStatement.execute();
                        }
                        com.reactnativecommunity.asyncstorage.b.b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                    } catch (Exception e13) {
                        Z1.a.J("ReactNative", e13.getMessage(), e13);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                    } catch (Exception e14) {
                        Z1.a.J("ReactNative", e14.getMessage(), e14);
                        com.reactnativecommunity.asyncstorage.b.b(null, e14.getMessage());
                    }
                    throw th;
                }
            } catch (Exception e15) {
                Z1.a.J("ReactNative", e15.getMessage(), e15);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e15.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e16) {
                    Z1.a.J("ReactNative", e16.getMessage(), e16);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e16.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f42063a.invoke(writableMapB);
                    } else {
                        this.f42063a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f42063a.invoke(writableMapB);
            } else {
                this.f42063a.invoke(new Object[0]);
            }
        }
    }

    class c extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f42066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f42067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f42066a = callback;
            this.f42067b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f42066a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().beginTransaction();
                    for (int i10 = 0; i10 < this.f42067b.size(); i10 += 999) {
                        int iMin = Math.min(this.f42067b.size() - i10, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.n().delete("catalystLocalStorage", com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f42067b, i10, iMin));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                    } catch (Exception e10) {
                        Z1.a.J("ReactNative", e10.getMessage(), e10);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                    }
                } catch (Exception e11) {
                    Z1.a.J("ReactNative", e11.getMessage(), e11);
                    WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                    } catch (Exception e12) {
                        Z1.a.J("ReactNative", e12.getMessage(), e12);
                        if (writableMapB2 == null) {
                            writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e12.getMessage());
                        }
                        if (writableMapB != null) {
                            this.f42066a.invoke(writableMapB);
                        } else {
                            this.f42066a.invoke(new Object[0]);
                        }
                    }
                    writableMapB = writableMapB2;
                }
                if (writableMapB != null) {
                    this.f42066a.invoke(writableMapB);
                } else {
                    this.f42066a.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e13) {
                    Z1.a.J("ReactNative", e13.getMessage(), e13);
                    com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                }
                throw th;
            }
        }
    }

    class d extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f42069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f42070b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f42069a = callback;
            this.f42070b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:64:0x0160  */
        /* JADX WARN: Code duplicated, block: B:65:0x016a  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f42069a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().beginTransaction();
                    for (int i10 = 0; i10 < this.f42070b.size(); i10++) {
                        if (this.f42070b.getArray(i10).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                Z1.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapD != null) {
                                    return;
                                }
                            }
                        } else if (this.f42070b.getArray(i10).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                Z1.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapC != null) {
                                    return;
                                }
                            }
                        } else if (this.f42070b.getArray(i10).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                Z1.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapD2 != null) {
                                    return;
                                }
                            }
                        } else if (!com.reactnativecommunity.asyncstorage.a.e(AsyncStorageModule.this.mReactDatabaseSupplier.n(), this.f42070b.getArray(i10).getString(0), this.f42070b.getArray(i10).getString(1))) {
                            WritableMap writableMapA = com.reactnativecommunity.asyncstorage.b.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                Z1.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapA != null) {
                                    return;
                                }
                            }
                        }
                        com.reactnativecommunity.asyncstorage.b.b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                    } catch (Exception e14) {
                        Z1.a.J("ReactNative", e14.getMessage(), e14);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e14.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                    } catch (Exception e15) {
                        Z1.a.J("ReactNative", e15.getMessage(), e15);
                        com.reactnativecommunity.asyncstorage.b.b(null, e15.getMessage());
                    }
                    throw th;
                }
            } catch (Exception e16) {
                Z1.a.J("ReactNative", e16.getMessage(), e16);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e16.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e17) {
                    Z1.a.J("ReactNative", e17.getMessage(), e17);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e17.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f42069a.invoke(writableMapB);
                    } else {
                        this.f42069a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f42069a.invoke(writableMapB);
            } else {
                this.f42069a.invoke(new Object[0]);
            }
        }
    }

    class e extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f42072a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f42072a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.j()) {
                this.f42072a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                this.f42072a.invoke(new Object[0]);
            } catch (Exception e10) {
                Z1.a.J("ReactNative", e10.getMessage(), e10);
                this.f42072a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage()));
            }
        }
    }

    class f extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f42074a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f42074a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f42074a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.n().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            writableArrayCreateArray.pushString(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    this.f42074a.invoke(null, writableArrayCreateArray);
                } catch (Exception e10) {
                    Z1.a.J("ReactNative", e10.getMessage(), e10);
                    this.f42074a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage()), null);
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.j();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.c();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.reactnativecommunity.asyncstorage.b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        g.g(reactApplicationContext);
        this.executor = new k(executor);
        this.mReactDatabaseSupplier = j.v(reactApplicationContext);
    }
}
