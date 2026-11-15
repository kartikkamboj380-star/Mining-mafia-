package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    CacheThreadHandler() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v53 */
    private void downloadFile(String str, String str2, int i10, int i11, final int i12, HashMap<String, List<String>> map, boolean z9, final CacheEventSender cacheEventSender) throws Throwable {
        Throwable th;
        ?? r10;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        FileOutputStream fileOutputStream5;
        FileOutputStream fileOutputStream6;
        FileOutputStream fileOutputStream7;
        if (this._canceled || str == null || str2 == null) {
            return;
        }
        final File file = new File(str2);
        Object obj = " to ";
        if (z9) {
            DeviceLog.debug("Unity Ads cache: resuming download " + str + " to " + str2 + " at " + file.length() + " bytes");
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + str2);
        }
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        WebRequest webRequest = null;
        try {
            try {
                FileOutputStream fileOutputStream8 = new FileOutputStream(file, z9);
                try {
                    WebRequest webRequest2 = getWebRequest(str, i10, i11, map);
                    this._currentRequest = webRequest2;
                    webRequest2.setProgressListener(new IWebRequestProgressListener() { // from class: com.unity3d.services.core.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestProgress(String str3, long j10, long j11) {
                            if (i12 <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= i12) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, str3, Long.valueOf(j10), Long.valueOf(j11));
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestStart(String str3, long j10, int i13, Map<String, List<String>> map2) {
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STARTED, str3, Long.valueOf(file.length()), Long.valueOf(j10 + file.length()), Integer.valueOf(i13), Request.getResponseHeadersMap(map2));
                        }
                    });
                    long jMakeStreamRequest = this._currentRequest.makeStreamRequest(fileOutputStream8);
                    this._active = false;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                    try {
                        postProcessDownload(jElapsedRealtime, str, file, jMakeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders(), cacheEventSender);
                        this._currentRequest = null;
                        try {
                            fileOutputStream7.close();
                        } catch (Exception e10) {
                            DeviceLog.exception("Error closing stream", e10);
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e10.getMessage());
                        }
                    } catch (NetworkIOException e11) {
                        e = e11;
                        fileOutputStream6 = fileOutputStream7;
                        DeviceLog.exception("Network error", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NETWORK_ERROR, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream6;
                        if (fileOutputStream6 != null) {
                            try {
                                fileOutputStream6.close();
                                obj = fileOutputStream6;
                            } catch (Exception e12) {
                                DeviceLog.exception("Error closing stream", e12);
                                CacheEvent cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                                Object obj2 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent, obj2, str, e12.getMessage());
                                obj = obj2;
                            }
                        }
                    } catch (FileNotFoundException e13) {
                        e = e13;
                        fileOutputStream5 = fileOutputStream7;
                        DeviceLog.exception("Couldn't create target file", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream5;
                        if (fileOutputStream5 != null) {
                            try {
                                fileOutputStream5.close();
                                obj = fileOutputStream5;
                            } catch (Exception e14) {
                                DeviceLog.exception("Error closing stream", e14);
                                CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj3 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent2, obj3, str, e14.getMessage());
                                obj = obj3;
                            }
                        }
                    } catch (IllegalStateException e15) {
                        e = e15;
                        fileOutputStream2 = fileOutputStream7;
                        DeviceLog.exception("Illegal state", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.ILLEGAL_STATE, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream2;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                obj = fileOutputStream2;
                            } catch (Exception e16) {
                                DeviceLog.exception("Error closing stream", e16);
                                CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj4 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent3, obj4, str, e16.getMessage());
                                obj = obj4;
                            }
                        }
                    } catch (MalformedURLException e17) {
                        e = e17;
                        fileOutputStream4 = fileOutputStream7;
                        DeviceLog.exception("Malformed URL", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.MALFORMED_URL, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream4;
                        if (fileOutputStream4 != null) {
                            try {
                                fileOutputStream4.close();
                                obj = fileOutputStream4;
                            } catch (Exception e18) {
                                DeviceLog.exception("Error closing stream", e18);
                                CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj5 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent4, obj5, str, e18.getMessage());
                                obj = obj5;
                            }
                        }
                    } catch (IOException e19) {
                        e = e19;
                        fileOutputStream3 = fileOutputStream7;
                        DeviceLog.exception("Couldn't request stream", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream3;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                                obj = fileOutputStream3;
                            } catch (Exception e20) {
                                DeviceLog.exception("Error closing stream", e20);
                                CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj6 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent5, obj6, str, e20.getMessage());
                                obj = obj6;
                            }
                        }
                    } catch (Exception e21) {
                        e = e21;
                        fileOutputStream = fileOutputStream7;
                        DeviceLog.exception("Unknown error", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.UNKNOWN_ERROR, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                obj = fileOutputStream;
                            } catch (Exception e22) {
                                DeviceLog.exception("Error closing stream", e22);
                                CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj7 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent6, obj7, str, e22.getMessage());
                                obj = obj7;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        r10 = fileOutputStream7;
                        this._currentRequest = webRequest;
                        if (r10 == 0) {
                            throw th;
                        }
                        try {
                            r10.close();
                            throw th;
                        } catch (Exception e23) {
                            DeviceLog.exception("Error closing stream", e23);
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e23.getMessage());
                            throw th;
                        }
                    }
                } catch (NetworkIOException e24) {
                    e = e24;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (FileNotFoundException e25) {
                    e = e25;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (IllegalStateException e26) {
                    e = e26;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (MalformedURLException e27) {
                    e = e27;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (IOException e28) {
                    e = e28;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (Exception e29) {
                    e = e29;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                }
            } catch (Throwable th4) {
                th = th4;
                r10 = obj;
            }
        } catch (NetworkIOException e30) {
            e = e30;
            webRequest = null;
            fileOutputStream6 = null;
        } catch (FileNotFoundException e31) {
            e = e31;
            webRequest = null;
            fileOutputStream5 = null;
        } catch (MalformedURLException e32) {
            e = e32;
            webRequest = null;
            fileOutputStream4 = null;
        } catch (IOException e33) {
            e = e33;
            webRequest = null;
            fileOutputStream3 = null;
        } catch (IllegalStateException e34) {
            e = e34;
            webRequest = null;
            fileOutputStream2 = null;
        } catch (Exception e35) {
            e = e35;
            webRequest = null;
            fileOutputStream = null;
        } catch (Throwable th5) {
            webRequest = null;
            th = th5;
            r10 = 0;
        }
    }

    private WebRequest getWebRequest(String str, int i10, int i11, HashMap<String, List<String>> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new WebRequest(str, "GET", map2, i10, i11);
    }

    private void postProcessDownload(long j10, String str, File file, long j11, long j12, boolean z9, int i10, Map<String, List<String>> map, CacheEventSender cacheEventSender) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z9) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(jElapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j11 + " bytes downloaded in " + jElapsedRealtime + "ms");
        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_END, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(jElapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        HashMap<String, List<String>> map;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i10 = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i11 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i12 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z9 = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            map = new HashMap<>();
            for (String str : data.keySet()) {
                map.put(str, Arrays.asList(data.getStringArray(str)));
            }
        } else {
            map = null;
        }
        HashMap<String, List<String>> map2 = map;
        File file = new File(string2);
        if ((z9 && !file.exists()) || (!z9 && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z9), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i10, i11, i12, map2, z9, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z9) {
        WebRequest webRequest;
        this._canceled = z9;
        if (!z9 || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
