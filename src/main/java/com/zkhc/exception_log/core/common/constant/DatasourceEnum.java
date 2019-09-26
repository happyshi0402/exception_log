/**
 * Copyright 2018-2020 stylefeng & fengshuonan (https://gitee.com/stylefeng)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zkhc.exception_log.core.common.constant;

/**
 * 多数据源的枚举
 *
 * @author fengshuonan
 * @date 2017年3月5日 上午10:15:02
 */
public interface DatasourceEnum {

    /**
     * 异常系统数据源
     */
    String DATA_SOURCE_EXCEPTION_ADMIN = "exceptionAdminDataSource";

    /**
     * znkf_admin数据源
     */
    String DATA_SOURCE_ZNKF_ADMIN = "znkfAdminDatasource";

    /**
     * logging数据源
     */
    String DATA_SOURCE_LOGGING = "loggingDatasource";

}