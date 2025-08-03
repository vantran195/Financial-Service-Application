import userApi from "../../api/UserApi";
import AuthAPI from "../../api/AuthAPI";

const RegisterService = {
    createUser: async (values) => {
        const userData = {
            firstName: values.firstName,
            lastName: values.lastName,
            username: values.username,
            email: values.email,
            cccd: values.cccd,
            birth: values.birth,
            gender: values.gender,
            phone: values.phone,
            password: values.password
        }

        // return await userApi.createUser(userData);
        return await AuthAPI.register(userData);
    }
}

export default RegisterService;