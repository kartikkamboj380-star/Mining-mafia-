package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.mq;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private static boolean kq = true;
    private static final AtomicBoolean oq = new AtomicBoolean(false);

    public static void kq(Context context) {
        if (context != null && kq && oq.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (mq.kq(context)) {
                        oq(context);
                        return;
                    }
                    String strOq = mq.oq(context);
                    try {
                        if (TextUtils.isEmpty(strOq)) {
                            strOq = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(strOq);
                    } catch (IllegalStateException unused) {
                        kq(strOq);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                fax.bob(th.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    private static void oq(Context context) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        Throwable th;
        String strOq = oq();
        File file = new File(context.getDir(TextUtils.isEmpty(strOq) ? "webview" : "webview_".concat(String.valueOf(strOq)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (file.exists()) {
            FileChannel fileChannel = null;
            FileLock fileLockTryLock = null;
            fileChannel = null;
            fileChannel = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    try {
                        channel = randomAccessFile.getChannel();
                        if (channel != null) {
                            try {
                                fileLockTryLock = channel.tryLock();
                            } catch (Exception unused) {
                                fileChannel = channel;
                                kq(file);
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (Throwable th2) {
                                        th2.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th4) {
                                        th4.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    throw th;
                                }
                                try {
                                    randomAccessFile.close();
                                    throw th;
                                } catch (Throwable th5) {
                                    th5.getMessage();
                                    throw th;
                                }
                            }
                        }
                        if (fileLockTryLock != null) {
                            fileLockTryLock.close();
                        } else {
                            kq(file);
                        }
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th6) {
                                th6.getMessage();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th7) {
                    th = th7;
                    channel = fileChannel;
                    th = th;
                    if (channel != null) {
                        channel.close();
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    randomAccessFile.close();
                    throw th;
                }
            } catch (Exception unused3) {
                randomAccessFile = null;
            } catch (Throwable th8) {
                th = th8;
                randomAccessFile = null;
                channel = null;
                th = th;
                if (channel != null) {
                    channel.close();
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                randomAccessFile.close();
                throw th;
            }
            try {
                randomAccessFile.close();
            } catch (Throwable th9) {
                th9.getMessage();
            }
        }
    }

    public static void kq() {
        kq = false;
    }

    private static void kq(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    private static void kq(File file) {
        kq(file, file.exists() ? file.delete() : false);
    }

    private static String oq() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void kq(File file, boolean z9) {
        if (!z9 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e10) {
            fax.bob("TTAD.TTMultiInitHelper", e10.getMessage());
        }
    }
}
