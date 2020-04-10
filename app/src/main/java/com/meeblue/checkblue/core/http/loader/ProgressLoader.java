/*
 * Copyright (C) 2020 meeblue
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.meeblue.checkblue.core.http.loader;

import android.content.Context;

import com.xuexiang.xhttp2.subsciber.impl.IProgressLoader;

/**
 * author alvin
 * since 2020-03-17
 */
public final class ProgressLoader {

    private ProgressLoader() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static IProgressLoaderFactory sIProgressLoaderFactory = new MiniProgressLoaderFactory();

    public static void setIProgressLoaderFactory(IProgressLoaderFactory sIProgressLoaderFactory) {
        ProgressLoader.sIProgressLoaderFactory = sIProgressLoaderFactory;
    }

    /**
     * 创建进度加载者
     *
     * @param context
     * @return
     */
    public static IProgressLoader create(Context context) {
        return sIProgressLoaderFactory.create(context);
    }

    /**
     * 创建进度加载者
     *
     * @param context
     * @param message 默认提示信息
     * @return
     */
    public static IProgressLoader create(Context context, String message) {
        return sIProgressLoaderFactory.create(context, message);
    }
}
