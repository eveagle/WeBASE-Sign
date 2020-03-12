/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.webase.sign.pojo.po;

import lombok.Data;

/**
 * UserInfo Plain Object from db
 */
@Data
public class UserInfoPo {
	/**
	 * id but no use
	 */
	private Integer userId;

    private String uuidUser;
	private String address;
	private String publicKey;
	private String privateKey;
    private String description;
	/**
	 * 0 is standard, 1 is guomi
	 */
	private Integer encryptType;
}
